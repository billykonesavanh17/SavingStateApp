package activity.ctec.savingstateapp.controller.model;

import android.app.Application;

/**
 * Created by bkon4208 on 10/14/15.
 */
public class AndroidSaveState
{
    private String userName;
    private boolean isTired;
    private int age;

    public AndroidSaveState()
    {
        this.userName = "defaust";
        this.isTired = false;
        this.age = -0;
    }

    public String getUserName()
    {
        return userName;
    }

    public boolean getIsTired()
    {
        return isTired;
    }

    public int getAge()
    {
        return age;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setIsTired(boolean isTired)
    {
        this.isTired = isTired;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    

}

