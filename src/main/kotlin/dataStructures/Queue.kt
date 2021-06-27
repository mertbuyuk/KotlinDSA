package dataStructures

import java.util.*
import kotlin.NoSuchElementException

class Queue<T> : Collection<T> {

    private var head : Node<T>? = null
    private var tail : Node<T>? = null

    override var size: Int = 0

    private class Node<T>(var value: T){
        var next : Node<T>? = null
    }

    fun addItem(item : T){
        val new = Node(item)
        val tail = this.tail

        if (tail == null){
            head = new
            this.tail = new
        }
        else{
            tail.next = new
            this.tail = new
        }
        size++
    }

    fun pop(){
        //same as stack
    }

    fun peek() : T{
        if (isEmpty()) throw NoSuchElementException()
        return head!!.value
    }

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        return size == 0
    }

    public override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            var node = head

            override fun hasNext(): Boolean {
                return node != null
            }

            override fun next(): T {
                if (!hasNext()) throw NoSuchElementException()
                val current = node!!
                node = current.next
                return current.value
            }
        }
    }
}