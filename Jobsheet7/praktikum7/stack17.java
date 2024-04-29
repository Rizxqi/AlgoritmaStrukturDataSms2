public class stack17 {

    int size;
    int top;
    book17 data[];

    public stack17(int size){
        this.size = size;
        data = new book17[size];
        top = -1;

    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull (){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(book17 dt ){
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public void pop (){
        if (!isEmpty()) {
            book17 x = data[top];
            top--;
            System.out.println("Remove Data : " + x.title +" "+
                    x.authorName + " " + x.publishedYear + " " +
                    x.pagesAmount+ " " + x.price );
        } else {
            System.out.println("Stack is empty ");
        }
    }

    public void peek(){
        System.out.println("Top element : " + data[top]);
    }

    public void print(){
        System.out.println("Stack content : ");
        for (int i = top; i >-0; i--) {
            System.out.println(data[i].title +" " + 
            data[i].authorName + " " + data[i].publishedYear+
            data[i].pagesAmount+ " "+ " " + data[i].price);
        }
        System.out.println(" ");
    }

    public void clear (){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty: ");
        } else {
            System.out.println("Failed stack still empty");
        }
    }
}

// public void pop (){
//         if (!isEmpty()) {
//             int x = data[top];
//             top--;
//             System.out.println("Remove Data : " + x);
//         } else {
//             System.out.println("Stack is empty ");
//         }
//     }