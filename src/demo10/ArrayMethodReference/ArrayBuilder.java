package demo10.ArrayMethodReference;
/*
 * ����һ����������ĺ����ӿ�
 */
@FunctionalInterface
public interface ArrayBuilder {
	//����һ������int��������ķ�����������������ĳ��ȣ����ش����õ�int��������
	int[] builderArray(int length);
}
