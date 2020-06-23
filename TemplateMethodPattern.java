package templateMethod;
public class TemplateMethodPattern
{
    public static void main(String[] args)
    {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}
//������
abstract class AbstractClass
{
    public void TemplateMethod() //ģ�巽��
    {
        SpecificMethod();
        abstractMethod1();          
         abstractMethod2();
    }  
    public void SpecificMethod() //���巽��
    {
        System.out.println("�������еľ��巽��������...");
    }   
    public abstract void abstractMethod1(); //���󷽷�1
    public abstract void abstractMethod2(); //���󷽷�2
}
//��������
class ConcreteClass extends AbstractClass
{
    public void abstractMethod1()
    {
        System.out.println("���󷽷�1��ʵ�ֱ�����...");
    }   
    public void abstractMethod2()
    {
        System.out.println("���󷽷�2��ʵ�ֱ�����...");
    }
}