package searching

class BinarySearch<T> {

    fun binarySearch(arr: Array<T>, item: T): Int {
        var low = 0
        var high = arr.size-1

        while (low <= high){

            val middle = (low + high)/2
            when{
                item < arr[middle] -> high = middle -1
                item > arr[middle] -> low = middle + 1
                else -> return middle
            } }

        return -1
    }

}