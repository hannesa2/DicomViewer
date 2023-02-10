/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra;

public class TCPActiveAddress extends TCPAddress {
  private transient long swigCPtr;

  protected TCPActiveAddress(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.TCPActiveAddress_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TCPActiveAddress obj) {
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
        imebraJNI.delete_TCPActiveAddress(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TCPActiveAddress(String node, String service) {
    this(imebraJNI.new_TCPActiveAddress__SWIG_0(node, service), true);
  }

  public TCPActiveAddress(TCPActiveAddress source) {
    this(imebraJNI.new_TCPActiveAddress__SWIG_1(TCPActiveAddress.getCPtr(source), source), true);
  }

}