package ru.geekbrains.algorithms2;

public class Arr {
    private int array[];
    private int size;
    public Arr (int size) {
        this.size = size;
        this.array = new int[size];
    }
    public void setElement(int index, int elem){
        this.array[index] = elem;
    }
    public void info () {
        for (int i = 0; i <this.size ; i++) {
            System.out.print(this.array[i] + " ");
            if (i%4==0) System.out.print("\n");
        }
        System.out.println();
        System.out.println(" ");
    }
    public void delete (int value) {
        int i;
        for (i=0; i <this.size ; i++) {
            if (this.array[i] == value) {
                break;
            }
        }
        for (int j = i; j<this.size;j++) {
            if (j+1>this.size-1) break;
            this.array[j] = this.array[j+1];
        }
        this.size--;
    }
    public void findElemIndex (int value) {
        int low = 0;
        int high = this.size-1;
        int mid;
        while(low<high){
            mid = (low+high)/2;
            if (value == this.array[mid]){
                System.out.println("Индекс искомого элемента: " + mid);
                return;
            }
            else {
                if (value < this.array[mid]){
                    high = mid;
                } else {
                    low = mid+1;
                }
            }
        }
        System.out.println ("Такого элемента нет в массиве");

    }

    public int getSize() {
        return size;
    }
    public void sortBubble(){
        double start = System.currentTimeMillis();
        int out, in;
        for (out = this.size-1;out>=1;out--){
            for(in=0;in<out;in++){
                if (this.array[in]>this.array[in+1]){
                    change(in, in+1);
                }
            }
        }
        double finish = System.currentTimeMillis();
        double time = (finish - start)/1000;
        System.out.println("Время выполнния сортировки: " +time);
    }

    public void sortSelect(){
        double start = System.currentTimeMillis();
        int out, in, mark;
        for(out=0;out<this.size;out++){
            mark = out;
            for(in = out+1;in<this.size;in++){
                if (this.array[in]< this.array[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
        double finish = System.currentTimeMillis();
        double time = (finish - start)/1000;
        System.out.println("Время выполнния сортировки: " +time);
    }
    public void sortInsert(){
        double start = System.currentTimeMillis();
        int in, out;
        for(out = 1;out < this.size; out++){
            int temp = this.array[out];
            in = out;
            while(in > 0 && this.array[in-1] >=temp){
                this.array[in] = this.array[in-1];
                --in;
            }
            this.array[in] = temp;
        }
        double finish = System.currentTimeMillis();
        double time = (finish - start)/1000;
        System.out.println("Время выполнния сортировки: " +time);
    }


    private void change(int a, int b){
        int tmp = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = tmp;
    }
}
