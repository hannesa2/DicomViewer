/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class NCreateResponse extends DimseResponse {
  private transient long swigCPtr;

  protected NCreateResponse(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.NCreateResponse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NCreateResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_NCreateResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NCreateResponse(NCreateCommand receivedCommand, DataSet attributeList) {
    this(imebraJNI.new_NCreateResponse__SWIG_0(NCreateCommand.getCPtr(receivedCommand), receivedCommand, DataSet.getCPtr(attributeList), attributeList), true);
  }

  public NCreateResponse(NCreateCommand receivedCommand, String affectedSopInstanceUid, DataSet attributeList) {
    this(imebraJNI.new_NCreateResponse__SWIG_1(NCreateCommand.getCPtr(receivedCommand), receivedCommand, affectedSopInstanceUid, DataSet.getCPtr(attributeList), attributeList), true);
  }

  public NCreateResponse(NCreateCommand receivedCommand, dimseStatusCode_t responseCode) {
    this(imebraJNI.new_NCreateResponse__SWIG_2(NCreateCommand.getCPtr(receivedCommand), receivedCommand, responseCode.swigValue()), true);
  }

  public NCreateResponse(NCreateCommand receivedCommand, String affectedSopInstanceUid) {
    this(imebraJNI.new_NCreateResponse__SWIG_3(NCreateCommand.getCPtr(receivedCommand), receivedCommand, affectedSopInstanceUid), true);
  }

  public NCreateResponse(NCreateResponse source) {
    this(imebraJNI.new_NCreateResponse__SWIG_4(NCreateResponse.getCPtr(source), source), true);
  }

}
