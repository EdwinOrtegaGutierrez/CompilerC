#include <stdio.h>

void bubbleSort(int array[], int size) {
    int newSize = size - 1;
    for (int step = 0; step < newSize; step++) {
        int steps = step - 1;
        int sizes = size - steps;
        for (int i = 0; i < sizes; i++) {    
            int first = array[i];
            int position = i + 1;
            int second = array[position];
            if (first > second) {
                int temp = array[i];
                int newPosition = i + 1;

                array[i] = array[newPosition];
                array[newPosition] = temp;
            }
        }
        
    }
}

void printArray(int array[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d  ", array[i]);
    }
    printf("\n");
}

int main() {
    int data[] = {-2, 45, 0, 11, -9};  
    // find the array's length
    int size = sizeof(data) / sizeof(data[0]);
    bubbleSort(data, size);
    printf("Sorted Array in Ascending Order:\n");
    printArray(data, size);
    return 0;
}