package com.example.cs115_coursework_1;
/**
 * 
 * A class that implements a queue.
 * The queue has the functions: peek, isFull, enqueue, dequeue and print
 * @author you
 *
 */


import java.util.NoSuchElementException;

public class Queue<T> {

	private QueueElement<T> head;
	private QueueElement<T> tail;
	private int size;

	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
	    //TODO: Write the Queue constructor
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty () {
	    //TODO:  Needs to return true when empty and false otherwise
		if (size == 0){
			return true;
		}
		return false;
	}
	
	
	/**
	 * Returns the element at the head of the queue
	 */
	public T peek () throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Queue is empty");
		}
		return head.getElement();
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue () throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException("Queue is empty");
		}
		head = head.getNext();
		size--;
		if (head == null) {
			tail = null;
		}
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue (T element) {
		QueueElement<T> newElement = new QueueElement<>(element, null);
		if (tail == null) {
			head = newElement;
		} else {
			tail.setNext(newElement);
		}
		tail = newElement;
		size++;
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {
		QueueElement<T> current = head;
		while (current != null) {
			System.out.println(current.getElement());
			current = current.getNext();
		}
		System.out.println();
	}

}
