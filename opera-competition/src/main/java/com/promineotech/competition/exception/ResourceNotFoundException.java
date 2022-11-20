/**
 * 
 */
package com.promineotech.competition.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Rainy P
 *
 */
@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  public String resourceName;
  public String fieldName;
  
  private Object findValue;

  /**
   * @param resourceName
   * @param fieldName
   * @param findValue
   */
  public ResourceNotFoundException(String resourceName, String fieldName, Object findValue) {
    super(String.format("%s not found with %s: '%s'", resourceName, fieldName, findValue));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.findValue = findValue;
  }

  /**
   * @return the resourceName
   */
  public String getResourceName() {
    return resourceName;
  }

  /**
   * @return the fieldName
   */
  public String getFieldName() {
    return fieldName;
  }

  /**
   * @return the findValue
   */
  public Object getFindValue() {
    return findValue;
  }
  
  

}
