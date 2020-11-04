package ca.durhamcollege;

public class Person
{
    // PRIVATE INSTANCE VARIABLES

    private String m_name;
    private int m_age;

    // PUBLIC PROPERTIES

    public String getName()
    {
        return m_name;
    }

    public void setName(String m_name)
    {
        this.m_name = m_name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int m_age)
    {
        this.m_age = m_age;
    }

    // CONSTRUCTORS

    /**
     * The default cosntructor sets name to "unknown" and age to 0
     */
    public Person()
    {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age)
    {
        this.m_name = "unknown";
        this.m_age = age;
    }

    // METHODS

    /**
     * This method tests the Person class and returns a simple message to the console
     */
    public void saysHello()
    {
        System.out.println(this.m_name + " says Hello!");
    }


    /**
     * This method overrides the built-in toString method and returns the Person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age : " + this.m_name;

        return outputString;
    }
}
