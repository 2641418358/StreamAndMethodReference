package demo09.ConstructorMethodReference;
/*
 * ����һ������Person����ĺ���ʽ�ӿ�
 */
@FunctionalInterface
public interface PersonBuilder {
	//����һ�����������ݴ��ݵ�����������Person����
	Person builderPerson(String name);
}
