package beans;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("===>SaumsngTV ��ü ����");
	}

	public void powerOn() {
		System.out.println("===>SaumsngTV ���� �ѱ�");
		
	}

	public void powerOff() {
		System.out.println("===>SaumsngTV ���� ����");
		
	}

	public void volumeUp() {
		System.out.println("===>SaumsngTV ���� ��");
		
	}

	public void volumeDown() {
		System.out.println("===>SaumsngTV ���� �ٿ�");
		
	}
	
	
	
}
