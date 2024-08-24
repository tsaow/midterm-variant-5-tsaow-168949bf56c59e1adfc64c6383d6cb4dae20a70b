package edu.usc.csci310.exams.midterm;

public class ProhibitedResource {

    int count = 0;


    public ProhibitedResource(int extra) throws Exception {
        if (extra>5) {
            throw (new Exception());
        } else {
            count+=extra;
        }
    }

    public String getResponse() throws Exception {
        if (count>2) {
            throw(new Exception());
        }
        return null;
    }

    public ProhibitedResource copy() {
        return null;
    }

    public boolean getStatus() {
        if (count>2) {
            return true;
        } else {
            return false;
        }
    }

    public int getAddCount(int extra) {
        count+=extra;
        return count;
    }

    public int getCount() {
        return count;
    }
}
