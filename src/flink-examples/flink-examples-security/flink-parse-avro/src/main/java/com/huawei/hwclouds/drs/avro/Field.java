/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.huawei.hwclouds.drs.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Field extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7647907005166951319L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Field\",\"namespace\":\"com.huawei.hwclouds.drs.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"dataTypeNumber\",\"type\":\"int\",\"doc\":\"2004, BinaryObject\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Field> ENCODER =
      new BinaryMessageEncoder<Field>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Field> DECODER =
      new BinaryMessageDecoder<Field>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Field> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Field> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Field>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Field to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Field from a ByteBuffer. */
  public static Field fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  /** 2004, BinaryObject */
  @Deprecated public int dataTypeNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Field() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param dataTypeNumber 2004, BinaryObject
   */
  public Field(java.lang.CharSequence name, java.lang.Integer dataTypeNumber) {
    this.name = name;
    this.dataTypeNumber = dataTypeNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return dataTypeNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: dataTypeNumber = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'dataTypeNumber' field.
   * @return 2004, BinaryObject
   */
  public java.lang.Integer getDataTypeNumber() {
    return dataTypeNumber;
  }

  /**
   * Sets the value of the 'dataTypeNumber' field.
   * 2004, BinaryObject
   * @param value the value to set.
   */
  public void setDataTypeNumber(java.lang.Integer value) {
    this.dataTypeNumber = value;
  }

  /**
   * Creates a new Field RecordBuilder.
   * @return A new Field RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Field.Builder newBuilder() {
    return new com.huawei.hwclouds.drs.avro.Field.Builder();
  }

  /**
   * Creates a new Field RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Field RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Field.Builder newBuilder(com.huawei.hwclouds.drs.avro.Field.Builder other) {
    return new com.huawei.hwclouds.drs.avro.Field.Builder(other);
  }

  /**
   * Creates a new Field RecordBuilder by copying an existing Field instance.
   * @param other The existing instance to copy.
   * @return A new Field RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Field.Builder newBuilder(com.huawei.hwclouds.drs.avro.Field other) {
    return new com.huawei.hwclouds.drs.avro.Field.Builder(other);
  }

  /**
   * RecordBuilder for Field instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Field>
    implements org.apache.avro.data.RecordBuilder<Field> {

    private java.lang.CharSequence name;
    /** 2004, BinaryObject */
    private int dataTypeNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.huawei.hwclouds.drs.avro.Field.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dataTypeNumber)) {
        this.dataTypeNumber = data().deepCopy(fields()[1].schema(), other.dataTypeNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Field instance
     * @param other The existing instance to copy.
     */
    private Builder(com.huawei.hwclouds.drs.avro.Field other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.dataTypeNumber)) {
        this.dataTypeNumber = data().deepCopy(fields()[1].schema(), other.dataTypeNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Field.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Field.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataTypeNumber' field.
      * 2004, BinaryObject
      * @return The value.
      */
    public java.lang.Integer getDataTypeNumber() {
      return dataTypeNumber;
    }

    /**
      * Sets the value of the 'dataTypeNumber' field.
      * 2004, BinaryObject
      * @param value The value of 'dataTypeNumber'.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Field.Builder setDataTypeNumber(int value) {
      validate(fields()[1], value);
      this.dataTypeNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'dataTypeNumber' field has been set.
      * 2004, BinaryObject
      * @return True if the 'dataTypeNumber' field has been set, false otherwise.
      */
    public boolean hasDataTypeNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'dataTypeNumber' field.
      * 2004, BinaryObject
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Field.Builder clearDataTypeNumber() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Field build() {
      try {
        Field record = new Field();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.dataTypeNumber = fieldSetFlags()[1] ? this.dataTypeNumber : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Field>
    WRITER$ = (org.apache.avro.io.DatumWriter<Field>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Field>
    READER$ = (org.apache.avro.io.DatumReader<Field>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
