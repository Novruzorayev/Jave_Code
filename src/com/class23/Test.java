package com.class23;

public class Test {
	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp = new Employee();
		System.out.println(Employee.department);
		Employee.work();
		//emp.work(); // emp.work is not preffered way
		emp.salary = 90000;
		emp.getPaid();
		System.out.println();
		
		System.out.println("---Creating ScrumTeam object---");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.work();
		st.salary = 10000;
		st.getPaid();
		st.artifacts = "Product Backlong, Sprint Backlong, BurnDown chart";
		st.ceremonies ="Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		System.out.println();
		
		System.out.println("---Creating Developer object---");
		Developer dev = new Developer();
		Developer.work();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprint backlog";
		dev.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
        System.out.println();
		System.out.println("---Creating Tester object---");
		Tester qa= new Tester();
		qa.salary = 100000;
		qa.getPaid();
		qa.artifacts = "Sprint backlog";
		qa.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		
		System.out.println();
		System.out.println("---Creating Bysines Aanalyst object---");
		BusinessAnalyst ba= new BusinessAnalyst();
		ba.salary = 100000;
		ba.getPaid();
		ba.artifacts = "Sprint backlog, Product backlog";
		ba.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		
		System.out.println();
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 150000;
		sm.getPaid();
		sm.artifacts = "Burn down chart";
		sm.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po = new ProductOwner();
		po.salary = 130000;
		po.getPaid();
		po.artifacts = "Sprint backlog, Product backlog";
		po.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBackLog();
		po.talkToTheClient();
		
		System.out.println();
		
		System.out.println("---Creating Manual Tester object---");
		ManualTester mt = new ManualTester();
		mt.salary = 80000;
		mt.getPaid();
		mt.artifacts = "Sprint backlog, Product backlog";
		mt.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.testManually();
		
		System.out.println();
		
		System.out.println("---Creating Automation Tester object---");
		AutomationTester at = new AutomationTester();
		at.salary = 150000;
		at.getPaid();
		at.artifacts = "Sprint backlog, Product backlog";
		at.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.codeInJava();
		
		System.out.println();
		
		System.out.println("---Creating Front End object---");
		FrontEnd fe = new FrontEnd();
		fe.salary = 110000;
		fe.getPaid();
		fe.artifacts = "Sprint backlog, Product backlog";
		fe.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.doHtml();
		
		System.out.println();
		
		System.out.println("---Creating Back End object---");
		BackEnd be = new BackEnd();
		be.salary = 170000;
		be.getPaid();
		be.artifacts = "Sprint backlog, Product backlog";
		be.ceremonies = "Sprint grooming, Sprint Planning, Daily StanUp, Sprint Demo, Sprint Retro";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.doSql();;
		
		
		
		
		
		
		
		
		
	
	
		
		
	}

}
