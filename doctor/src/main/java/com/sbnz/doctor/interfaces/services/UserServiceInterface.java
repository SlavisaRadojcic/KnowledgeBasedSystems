/**
 * 
 */
package com.sbnz.doctor.interfaces.services;

import com.sbnz.doctor.dto.UserDTO;


public interface UserServiceInterface extends ServiceInterface<UserDTO> {

	public UserDTO getUserByUsername(String username);
}
