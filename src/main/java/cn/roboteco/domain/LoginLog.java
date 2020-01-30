package cn.roboteco.domain;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class LoginLog implements Serializable{
	private int loginLogId;

	private int userId;

	private String ip;

	private Date loginDate;

}
