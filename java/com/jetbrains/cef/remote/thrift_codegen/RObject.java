/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jetbrains.cef.remote.thrift_codegen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class RObject implements org.apache.thrift.TBase<RObject, RObject._Fields>, java.io.Serializable, Cloneable, Comparable<RObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RObject");

  private static final org.apache.thrift.protocol.TField OBJ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("objId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IS_PERSISTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("isPersistent", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField IS_DISABLE_DEFAULT_HANDLING_FIELD_DESC = new org.apache.thrift.protocol.TField("isDisableDefaultHandling", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField OBJ_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("objInfo", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RObjectStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RObjectTupleSchemeFactory();

  public int objId; // required
  public boolean isPersistent; // optional
  public boolean isDisableDefaultHandling; // optional
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> objInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBJ_ID((short)1, "objId"),
    IS_PERSISTENT((short)2, "isPersistent"),
    IS_DISABLE_DEFAULT_HANDLING((short)3, "isDisableDefaultHandling"),
    OBJ_INFO((short)4, "objInfo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OBJ_ID
          return OBJ_ID;
        case 2: // IS_PERSISTENT
          return IS_PERSISTENT;
        case 3: // IS_DISABLE_DEFAULT_HANDLING
          return IS_DISABLE_DEFAULT_HANDLING;
        case 4: // OBJ_INFO
          return OBJ_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OBJID_ISSET_ID = 0;
  private static final int __ISPERSISTENT_ISSET_ID = 1;
  private static final int __ISDISABLEDEFAULTHANDLING_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IS_PERSISTENT,_Fields.IS_DISABLE_DEFAULT_HANDLING,_Fields.OBJ_INFO};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBJ_ID, new org.apache.thrift.meta_data.FieldMetaData("objId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_PERSISTENT, new org.apache.thrift.meta_data.FieldMetaData("isPersistent", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_DISABLE_DEFAULT_HANDLING, new org.apache.thrift.meta_data.FieldMetaData("isDisableDefaultHandling", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.OBJ_INFO, new org.apache.thrift.meta_data.FieldMetaData("objInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RObject.class, metaDataMap);
  }

  public RObject() {
  }

  public RObject(
    int objId)
  {
    this();
    this.objId = objId;
    setObjIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RObject(RObject other) {
    __isset_bitfield = other.__isset_bitfield;
    this.objId = other.objId;
    this.isPersistent = other.isPersistent;
    this.isDisableDefaultHandling = other.isDisableDefaultHandling;
    if (other.isSetObjInfo()) {
      java.util.Map<java.lang.String,java.lang.String> __this__objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(other.objInfo);
      this.objInfo = __this__objInfo;
    }
  }

  public RObject deepCopy() {
    return new RObject(this);
  }

  @Override
  public void clear() {
    setObjIdIsSet(false);
    this.objId = 0;
    setIsPersistentIsSet(false);
    this.isPersistent = false;
    setIsDisableDefaultHandlingIsSet(false);
    this.isDisableDefaultHandling = false;
    this.objInfo = null;
  }

  public int getObjId() {
    return this.objId;
  }

  public RObject setObjId(int objId) {
    this.objId = objId;
    setObjIdIsSet(true);
    return this;
  }

  public void unsetObjId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OBJID_ISSET_ID);
  }

  /** Returns true if field objId is set (has been assigned a value) and false otherwise */
  public boolean isSetObjId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OBJID_ISSET_ID);
  }

  public void setObjIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OBJID_ISSET_ID, value);
  }

  public boolean isIsPersistent() {
    return this.isPersistent;
  }

  public RObject setIsPersistent(boolean isPersistent) {
    this.isPersistent = isPersistent;
    setIsPersistentIsSet(true);
    return this;
  }

  public void unsetIsPersistent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISPERSISTENT_ISSET_ID);
  }

  /** Returns true if field isPersistent is set (has been assigned a value) and false otherwise */
  public boolean isSetIsPersistent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISPERSISTENT_ISSET_ID);
  }

  public void setIsPersistentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISPERSISTENT_ISSET_ID, value);
  }

  public boolean isIsDisableDefaultHandling() {
    return this.isDisableDefaultHandling;
  }

  public RObject setIsDisableDefaultHandling(boolean isDisableDefaultHandling) {
    this.isDisableDefaultHandling = isDisableDefaultHandling;
    setIsDisableDefaultHandlingIsSet(true);
    return this;
  }

  public void unsetIsDisableDefaultHandling() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISDISABLEDEFAULTHANDLING_ISSET_ID);
  }

  /** Returns true if field isDisableDefaultHandling is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDisableDefaultHandling() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISDISABLEDEFAULTHANDLING_ISSET_ID);
  }

  public void setIsDisableDefaultHandlingIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISDISABLEDEFAULTHANDLING_ISSET_ID, value);
  }

  public int getObjInfoSize() {
    return (this.objInfo == null) ? 0 : this.objInfo.size();
  }

  public void putToObjInfo(java.lang.String key, java.lang.String val) {
    if (this.objInfo == null) {
      this.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.objInfo.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getObjInfo() {
    return this.objInfo;
  }

  public RObject setObjInfo(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> objInfo) {
    this.objInfo = objInfo;
    return this;
  }

  public void unsetObjInfo() {
    this.objInfo = null;
  }

  /** Returns true if field objInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetObjInfo() {
    return this.objInfo != null;
  }

  public void setObjInfoIsSet(boolean value) {
    if (!value) {
      this.objInfo = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case OBJ_ID:
      if (value == null) {
        unsetObjId();
      } else {
        setObjId((java.lang.Integer)value);
      }
      break;

    case IS_PERSISTENT:
      if (value == null) {
        unsetIsPersistent();
      } else {
        setIsPersistent((java.lang.Boolean)value);
      }
      break;

    case IS_DISABLE_DEFAULT_HANDLING:
      if (value == null) {
        unsetIsDisableDefaultHandling();
      } else {
        setIsDisableDefaultHandling((java.lang.Boolean)value);
      }
      break;

    case OBJ_INFO:
      if (value == null) {
        unsetObjInfo();
      } else {
        setObjInfo((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJ_ID:
      return getObjId();

    case IS_PERSISTENT:
      return isIsPersistent();

    case IS_DISABLE_DEFAULT_HANDLING:
      return isIsDisableDefaultHandling();

    case OBJ_INFO:
      return getObjInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OBJ_ID:
      return isSetObjId();
    case IS_PERSISTENT:
      return isSetIsPersistent();
    case IS_DISABLE_DEFAULT_HANDLING:
      return isSetIsDisableDefaultHandling();
    case OBJ_INFO:
      return isSetObjInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RObject)
      return this.equals((RObject)that);
    return false;
  }

  public boolean equals(RObject that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_objId = true;
    boolean that_present_objId = true;
    if (this_present_objId || that_present_objId) {
      if (!(this_present_objId && that_present_objId))
        return false;
      if (this.objId != that.objId)
        return false;
    }

    boolean this_present_isPersistent = true && this.isSetIsPersistent();
    boolean that_present_isPersistent = true && that.isSetIsPersistent();
    if (this_present_isPersistent || that_present_isPersistent) {
      if (!(this_present_isPersistent && that_present_isPersistent))
        return false;
      if (this.isPersistent != that.isPersistent)
        return false;
    }

    boolean this_present_isDisableDefaultHandling = true && this.isSetIsDisableDefaultHandling();
    boolean that_present_isDisableDefaultHandling = true && that.isSetIsDisableDefaultHandling();
    if (this_present_isDisableDefaultHandling || that_present_isDisableDefaultHandling) {
      if (!(this_present_isDisableDefaultHandling && that_present_isDisableDefaultHandling))
        return false;
      if (this.isDisableDefaultHandling != that.isDisableDefaultHandling)
        return false;
    }

    boolean this_present_objInfo = true && this.isSetObjInfo();
    boolean that_present_objInfo = true && that.isSetObjInfo();
    if (this_present_objInfo || that_present_objInfo) {
      if (!(this_present_objInfo && that_present_objInfo))
        return false;
      if (!this.objInfo.equals(that.objInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + objId;

    hashCode = hashCode * 8191 + ((isSetIsPersistent()) ? 131071 : 524287);
    if (isSetIsPersistent())
      hashCode = hashCode * 8191 + ((isPersistent) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetIsDisableDefaultHandling()) ? 131071 : 524287);
    if (isSetIsDisableDefaultHandling())
      hashCode = hashCode * 8191 + ((isDisableDefaultHandling) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetObjInfo()) ? 131071 : 524287);
    if (isSetObjInfo())
      hashCode = hashCode * 8191 + objInfo.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetObjId(), other.isSetObjId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objId, other.objId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsPersistent(), other.isSetIsPersistent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsPersistent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isPersistent, other.isPersistent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsDisableDefaultHandling(), other.isSetIsDisableDefaultHandling());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDisableDefaultHandling()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isDisableDefaultHandling, other.isDisableDefaultHandling);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetObjInfo(), other.isSetObjInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objInfo, other.objInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RObject(");
    boolean first = true;

    sb.append("objId:");
    sb.append(this.objId);
    first = false;
    if (isSetIsPersistent()) {
      if (!first) sb.append(", ");
      sb.append("isPersistent:");
      sb.append(this.isPersistent);
      first = false;
    }
    if (isSetIsDisableDefaultHandling()) {
      if (!first) sb.append(", ");
      sb.append("isDisableDefaultHandling:");
      sb.append(this.isDisableDefaultHandling);
      first = false;
    }
    if (isSetObjInfo()) {
      if (!first) sb.append(", ");
      sb.append("objInfo:");
      if (this.objInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.objInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'objId' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RObjectStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RObjectStandardScheme getScheme() {
      return new RObjectStandardScheme();
    }
  }

  private static class RObjectStandardScheme extends org.apache.thrift.scheme.StandardScheme<RObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.objId = iprot.readI32();
              struct.setObjIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_PERSISTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isPersistent = iprot.readBool();
              struct.setIsPersistentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_DISABLE_DEFAULT_HANDLING
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isDisableDefaultHandling = iprot.readBool();
              struct.setIsDisableDefaultHandlingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OBJ_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.objInfo.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setObjInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetObjId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'objId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OBJ_ID_FIELD_DESC);
      oprot.writeI32(struct.objId);
      oprot.writeFieldEnd();
      if (struct.isSetIsPersistent()) {
        oprot.writeFieldBegin(IS_PERSISTENT_FIELD_DESC);
        oprot.writeBool(struct.isPersistent);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsDisableDefaultHandling()) {
        oprot.writeFieldBegin(IS_DISABLE_DEFAULT_HANDLING_FIELD_DESC);
        oprot.writeBool(struct.isDisableDefaultHandling);
        oprot.writeFieldEnd();
      }
      if (struct.objInfo != null) {
        if (struct.isSetObjInfo()) {
          oprot.writeFieldBegin(OBJ_INFO_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.objInfo.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter4 : struct.objInfo.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RObjectTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RObjectTupleScheme getScheme() {
      return new RObjectTupleScheme();
    }
  }

  private static class RObjectTupleScheme extends org.apache.thrift.scheme.TupleScheme<RObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.objId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIsPersistent()) {
        optionals.set(0);
      }
      if (struct.isSetIsDisableDefaultHandling()) {
        optionals.set(1);
      }
      if (struct.isSetObjInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetIsPersistent()) {
        oprot.writeBool(struct.isPersistent);
      }
      if (struct.isSetIsDisableDefaultHandling()) {
        oprot.writeBool(struct.isDisableDefaultHandling);
      }
      if (struct.isSetObjInfo()) {
        {
          oprot.writeI32(struct.objInfo.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter5 : struct.objInfo.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.objId = iprot.readI32();
      struct.setObjIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.isPersistent = iprot.readBool();
        struct.setIsPersistentIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isDisableDefaultHandling = iprot.readBool();
        struct.setIsDisableDefaultHandlingIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.objInfo = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map6.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key7;
          @org.apache.thrift.annotation.Nullable java.lang.String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.objInfo.put(_key7, _val8);
          }
        }
        struct.setObjInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

