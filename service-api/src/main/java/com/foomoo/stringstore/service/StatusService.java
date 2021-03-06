package com.foomoo.stringstore.service;

/**
 * Provides the status of the storage service.
 */
public interface StatusService {

    /**
     * Get the status of the service by reporting the number of strings and requests stored.
     *
     * @return The status of the service.
     */
    Status getStatus();

}
