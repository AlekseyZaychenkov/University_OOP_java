package Task_06;

import Task_06.GUI.GUI_Task_06;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Aleksey Zaychenkov on 19.12.2019.
 */
public class TransactionHandler {
    private static ConcurrentLinkedQueue<Transaction> queue = new ConcurrentLinkedQueue<>();
    private static Map<Integer, Account> accountMap = new ConcurrentHashMap<>();

    static class TransactionProcessor extends Thread {
        @Override
        public void run() {
            GUI_Task_06.myStringBuffer.append("Запущен поток " + getName()+"\n");

            Transaction transaction;
            while ((transaction = queue.poll()) != null )
                executeTransaction(transaction);
        }
    }

    private synchronized static void executeTransaction(Transaction transaction){
        // не то чтобы нам действительно нужно повторять каждую транзакцию
        // 100 раз, но для чистоты эксперимента лучше перестраховаться
        // с большим количеством операций
        for (int i =0; i<100; i++) {
            Account account_01 = accountMap.get(transaction.getFrom());
            Account account_02 = accountMap.get(transaction.getTo());
            account_01.setBill(account_01.getBill() - transaction.getAmount());
            account_02.setBill(account_02.getBill() + transaction.getAmount());
        }
    }

    private static ConcurrentLinkedQueue<Transaction> getTransactionQueue(File inputFile) {
        ObjectMapper mapper = new ObjectMapper();
        List<Transaction> listTransaction = new ArrayList<Transaction>();

        try {
            listTransaction = mapper.readValue(inputFile, new TypeReference<ArrayList<Transaction>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        ConcurrentLinkedQueue<Transaction> listTransactionConcurrent = new ConcurrentLinkedQueue<Transaction>(listTransaction);
        return listTransactionConcurrent;
    }


    public static void runHandling(File inputFile){
        // мапа для хранения аккаунтов; 10000 на каждом счету изначально
        for (int i=0; i<4;i++)
            accountMap.put(i, new Account(i, 10000));

        GUI_Task_06.myStringBuffer.append("До обработки:"+"\n");
        for (Map.Entry<Integer, Account> entry : accountMap.entrySet())
            GUI_Task_06.myStringBuffer.append(entry.getValue()+"\n");

        // Получаем очередь транзакций
        queue = getTransactionQueue(inputFile);

        // Создаем и запускаем треды обрабатывающие очередь с транзакциями.
        TransactionProcessor t1 = new TransactionProcessor();
        TransactionProcessor t2 = new TransactionProcessor();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        GUI_Task_06.myStringBuffer.append("После обработки:"+"\n");
        for (Map.Entry<Integer, Account> entry : accountMap.entrySet())
            GUI_Task_06.myStringBuffer.append(entry.getValue()+"\n");

    }
}
