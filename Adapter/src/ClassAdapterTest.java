
//Ŀ��ӿ�
interface Target
{
    public void request();
}
//�����߽ӿ�
class Adaptee
{
    public void specificRequest()
    {       
        System.out.println("�������е�ҵ����뱻���ã�");
    }
}
//����������
class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}
//�ͻ��˴���
public class ClassAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("��������ģʽ���ԣ�");
        Target target = new ClassAdapter();
        target.request();
    }
}