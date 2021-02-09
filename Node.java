import java.util.*;
import java.util.PriorityQueue;


class Node{

    public static void main(String[] args) {
        Node n = new Node();

       /*  int[] arr = {1,2,3,9,10,12};
        int k = 7;

        Node n = new Node();
        System.out.println(n.solution(arr, k)); */

        int [][] jobs = {{0,3},{1,9},{2,6}};
        Arrays.sort(jobs,);
        n.solution(jobs);
    }

    //디스크 컨트롤러
    public int solution(int[][] jobs) {
        int answer = 0;
        int len = jobs.length;

        for(int i=0; i<len; i++){
            System.out.println(jobs[0][i]);
        }


        return answer;
    }

    //더맵게
    public int solution(int[] scovile, int k){
        int answer = 0;
        PriorityQueue<Integer> pQue = new PriorityQueue<>();

        for(int i=0; i <scovile.length; i++){
            pQue.offer(scovile[i]);    
        }
        
        while(pQue.peek()<k){
            if(pQue.size()==1){
                return -1;
            }

            pQue.offer(pQue.poll() + (pQue.poll()*2));
            answer++;
        }

        return answer;
    }



}