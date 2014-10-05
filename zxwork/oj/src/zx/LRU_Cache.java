package zx;

import java.util.HashMap;

public class LRU_Cache {
	int capacity;
	int num = 0;
	linklist list = new linklist();
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	class node {
		int key;

		node pre;
		node next;
	}

	class linklist {

		node head = new node();

		public linklist() {
			// TODO Auto-generated constructor stub
			this.head.next = null;
			this.head.pre = null;
		}

	}

	public LRU_Cache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		int value;
		if (map.containsKey(key)) {

			value = map.get(key);
			if (list.head.next.key == key) {// 在第一个节点
				return value;

			} else if (list.head.pre.key == key) {
				node temp = list.head.pre;
				temp.pre.next = list.head;
				list.head.pre = temp.pre;
				temp.next = list.head.next;
				temp.next.pre = temp;
				list.head.next = temp;
				temp.pre = list.head;

				return value;
			} else {
				node temp = list.head.next;
				while (temp.key != key) {
					temp = temp.next;
				}
				temp.pre.next = temp.next;
				temp.next.pre = temp.pre;
				temp.next = list.head.next;
				list.head.next.pre = temp;
				temp.pre = list.head;
				list.head.next = temp;
				return value;
			}

		} else
			return -1;
	}

	public void set(int key, int value) {
		if (capacity <= 0) {
			return;
		}
		if (map.containsKey(key)) {

			if (list.head.next.key == key) {// 在第一个节点

			} else if (list.head.pre.key == key) {
				node temp = list.head.pre;
				temp.pre.next = list.head;
				list.head.pre = temp.pre;
				temp.next = list.head.next;
				temp.next.pre = temp;
				list.head.next = temp;
				temp.pre = list.head;

			} else {
				node temp = list.head.next;
				while (temp.key != key) {
					temp = temp.next;
				}
				temp.pre.next = temp.next;
				temp.next.pre = temp.pre;
				temp.next = list.head.next;
				list.head.next.pre = temp;
				temp.pre = list.head;
				list.head.next = temp;

			}
			map.put(key, value);
			return;
		}
		map.put(key, value);
		node temp = new node();
		temp.key = key;

		if (num < capacity) {

			if (num == 0) {

				list.head.next = temp;
				list.head.next.next = list.head;
				list.head.next.pre = list.head;
				list.head.pre = list.head.next;
				num++;
			}

			else {
				temp.next = list.head.next;
				temp.pre = list.head;
				temp.next.pre = temp;
				list.head.next = temp;
				num++;
			}
		} else {
			int del = list.head.pre.key;
			map.remove(del);
			list.head.pre.key = key;

			temp = list.head.pre;
			temp.pre.next = list.head;
			list.head.pre = temp.pre;
			temp.pre = list.head;
			temp.next = list.head.next;
			list.head.next.pre = temp;
			list.head.next = temp;
		}
	}

	public static void main(String[] args) {
		LRU_Cache cache = new LRU_Cache(2);
		cache.set(2, 1);
		cache.set(1, 1);
		cache.set(2, 3);

		cache.set(4, 1);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));

		// node h = cache.list.head.next;
		// while (h!= cache.list.head) {
		// System.out.println(h.value);
		// h=h.next;
		// }
	}

}
