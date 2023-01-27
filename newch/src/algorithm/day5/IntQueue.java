package algorithm.day5;

public class IntQueue {
    private int[] que;            // 큐 자료구조로 사용할  배열
    private int capacity;         // 큐의 크기(용량)
    private int front;            // 맨 처음 요소 커서
    private int rear;             // 맨 끝 요소 커서
    private int num;              // 현재 데이터 개수 

    //--- 실행시 예외: 큐가 비어있음 ---//
     EmptyIntQueueException  

    //--- 실행시 예외: 큐가 가득 찼음 ---//
      OverflowIntQueueException  

    //--- 생성자(constructor) ---//
    public IntQueue(int maxlen) {
         
    }

    
    //--- 큐에 데이터를 인큐(insert) ---//
    public int enque(int x) throws OverflowIntQueueException {
         
    }

    //--- 큐에서 데이터를 디큐 ---//
    public int deque() throws EmptyIntQueueException {
        
    }

    //--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
    public int peek() throws EmptyIntQueueException {
         
    }

    //--- 큐를 비움 ---//
    public void clear() {
         
    }

    //--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
    public int indexOf(int x) {
        
    }

    //--- 큐의 크기를 반환 ---//
    public int getCapacity() {
        
    }

    //--- 큐에 쌓여 있는 데이터 개수를 반환 ---//
    public int size() {
         
    }

    //--- 큐가 비어있는가? ---//
    public boolean isEmpty() {
        
    }

    //--- 큐가 가득 찼는가? ---//
    public boolean isFull() {
        
    }

    //--- 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력 ---//
    public void dump() {
       
    }
}