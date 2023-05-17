package com.vick.HW2.LinkedList;

public class QueueTest {
    private Element firstElement;
    private Element lastElement;

    public void addInTall(Object data) {
        Element newElement = new Element();
        newElement.data = data;

        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        }
        else {
            lastElement.nextElement = newElement;
            lastElement = newElement;
        }
    }
    public void addInHead(Object data) {
        Element newElement = new Element();
        newElement.data = data;

        if (firstElement == null) {
            firstElement = newElement;
            lastElement = newElement;
        }
        else {
            newElement.nextElement = firstElement;
            firstElement = newElement;
        }
    }

    public boolean isEmpty(){
        return firstElement == null;
    }
    public void removeFirst(){
        if (!isEmpty())
            firstElement = firstElement.nextElement;
    }
    public void removeLast(){
        if (!isEmpty()) {
            if (firstElement.nextElement == null) {
                firstElement = null;
            }
            else {
                Element checkElement = firstElement;
                while (true){
                    if (checkElement.nextElement.equals(lastElement)){
                        checkElement.nextElement = null;
                        break;
                    }
                    else {
                        checkElement = checkElement.nextElement;
                    }
                }
            }
        }
    }

    public void remove(Object data) {
        if (isElementInList(data)) {
            if (firstElement.data.equals(data)){
                removeFirst();
            }
            else {
                Element checkElement = firstElement;
                while (true) {
                    if (checkElement.nextElement.data.equals(data)) {
                        checkElement.nextElement = checkElement.nextElement.nextElement;
                        break;
                    }
                    else {
                        checkElement = checkElement.nextElement;
                    }

                }
            }
        }
    }


    public boolean isElementInList(Object data){
        Element checkElement;
        if (firstElement != null){
            checkElement = firstElement;
            do {
                if (checkElement.data.equals(data)){
                    return true;
                }
                else {
                    checkElement = checkElement.nextElement;
                }
            } while (checkElement != null);
        }
        return false;
    }


    public String print() {
        if (firstElement != null) {
            Element e = this.firstElement;
            while (e != null) {
                System.out.println(e.data + "; ");
                e = e.nextElement;
            }
        }
        return "";
    }
}
