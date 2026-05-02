package org.pgsg.common.domain;

public enum OutboxStatus {
	PENDING,
	PROCESSED,
	SENDING,
	PERMANENT_FAILURE
}
