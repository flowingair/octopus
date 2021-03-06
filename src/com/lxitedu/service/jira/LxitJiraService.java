package com.lxitedu.service.jira;

import com.atlassian.jira.rpc.soap.client.LxitJiraManager;
import com.atlassian.jira.rpc.soap.client.RemoteException;
import com.atlassian.jira.rpc.soap.client.RemoteIssue;
import com.atlassian.jira.rpc.soap.client.RemoteProject;
import com.lxitedu.bean.LxitClass;
import com.lxitedu.bean.Student;

//this is samlin add 2010-5-5
public class LxitJiraService {

	public void createDayProblem(LxitClass lxitClass) {
		LxitJiraManager.createDayProblemProject(lxitClass);

	}

	public static void createSingleUser(Student bean) {
		LxitJiraManager.createSingleUser(bean);
	}

	public void createStudnetAndGroup(LxitClass lxitClass) {
		LxitJiraManager.createStudnetAndGroup(lxitClass);

	}

	public void createGroup(String id) {
		LxitJiraManager.createGroup(id);

	}

	public void deleteIssueFromClassId(String id) {
		LxitJiraManager.batchDeleteIssueFromClassId(id);

	}

	public void createDayLogPermissionsAndScheme(String classId) {
		LxitJiraManager.createDayLogPermissionsAndScheme(classId);
	}

	public void createDayLogProject(String id) {
		LxitJiraManager.createDayLogProject(id);

	}

	public static void fixIssue(String issueKey) {
		try {
			LxitJiraManager.fixIssue(issueKey);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.rmi.RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public RemoteIssue[] getIssueByJql(String jql) {
		try {
			return LxitJiraManager.getIssuesByJql(jql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void fixIssueBy1003(String key) {
		try {
			LxitJiraManager.fixIssueBy1003(key);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.rmi.RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public RemoteIssue getIssueByKey(String string) {
		return LxitJiraManager.getIssueByKey(string);

	}

	public RemoteProject getProjectByKey(String string) {
		// TODO Auto-generated method stub
		return LxitJiraManager.getProjectByKey(string);
	}
}
