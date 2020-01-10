package com.sbnz.doctor.controller;

import java.util.concurrent.TimeUnit;

import org.drools.core.time.SessionPseudoClock;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import com.sbnz.doctor.dto.WebsocketMessage;
import com.sbnz.doctor.interfaces.services.PatientServiceInterface;
import com.sbnz.doctor.monitoring.Heartbeat;
import com.sbnz.doctor.monitoring.ChangeOxygenLevel;
import com.sbnz.doctor.monitoring.PatientModel;
import com.sbnz.doctor.monitoring.UrinationAmount;


@Controller
public class PatientMonitoringController {

	
	

}