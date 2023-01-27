package bar;

import foo.Parent;

public class Other {
	public void method() {
		Parent p = new Parent();
		System.out.println(p.name);
		p.name = "seoul";
		System.out.println(p.name);
	}
}
