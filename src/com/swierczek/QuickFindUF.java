package com.swierczek;

/**
 * Created by Grzegorz on 20.11.2016.
 */
public class QuickFindUF {

    private int[] id;

    //set id of each object to itself (N array access)
    public QuickFindUF(int N){
        id = new int[N];
        for (int i=0; i<N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union (int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i=0; i<id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }
}
