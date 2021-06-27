package dataStructures
import java.util.*

class Stack<T> : Collection<T> {
    private var head : Node<T>? = null

    override var size: Int = 0


    private class Node<T>(var value: T){
        var next : Node<T>? = null
    }

    fun push(item: T){
        val new = Node(item)
        new.next = head
        head = new
        size++
    }

    fun peek() : T{
        if (isEmpty()) throw NoSuchElementException()
        return head!!.value
    }
    fun pop() : T {
        if (isEmpty()) throw NoSuchElementException()

        var prev = head!!
        head = prev.next
        size--

        return prev.value
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