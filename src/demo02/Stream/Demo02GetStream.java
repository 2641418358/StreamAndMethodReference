package demo02.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
 * java.util.stream.Stream<T>��Java 8 �¼������õ����ӿڡ����Ⲣ����һ�������ӿڣ�
 * ��ȡһ�����ǳ��򵥣������»��г��õķ�ʽ��
 * 		-���е�Collection���϶�����ͨ��streamĬ�Ϸ�����ȡ��
 * 			default Stream<E> stream()
 * 		-Stream�ӿڵľ�̬����ofk���Ի�ȡ�����Ӧ����
 * 			static <T> Stream<T> of(T... values)
 * 			������һ���ɱ��������ô���ǾͿ��Դ���һ������
 */
public class Demo02GetStream {
	public static void main(String[] args) {
		//�Ѽ���ת��ΪStream��
		List<String> list = new ArrayList<String>();
		Stream<String> stream1 = list.stream();
		
		Set<String> set = new HashSet<String>();
		Stream<String> stream2 = set.stream();
		
		Map<String, String> map = new HashMap<>();
		//��ȡ�����洢��һ��set������
		Set<String> keyset = map.keySet();
		Stream<String> stream3 = keyset.stream();
		
		//��ȡֵ���洢��һ��Collection������
		Collection<String> values = map.values();
		Stream<String> stream4 = values.stream();
		
		//��ȡ��ֵ�ԣ�����ֵ��ӳ���ϵ entrySet()��
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		Stream<Map.Entry<String, String>> stream5 = entrys.stream();
		
		//������ת��ΪStream��
		Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
		//�ɱ�������Դ�������,�ַ�������Ҳ����
		Integer [] arr = {1, 2, 3, 4, 5};
		Stream<Integer> stream7 = Stream.of(arr);
	}
}
