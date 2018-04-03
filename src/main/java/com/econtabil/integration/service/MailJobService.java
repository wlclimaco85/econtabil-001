package com.econtabil.integration.service;

import com.econtabil.integration.data.BaseService;
import com.econtabil.integration.domain.Job;
import com.econtabil.integration.domain.User;

/**
 * @author: kameshr
 */
public interface MailJobService extends BaseService<Job, Long> {

    /**
     * Sends the confirmation mail to user.
     *
     * @param user
     */
    public void sendConfirmationMail(User user);
}
