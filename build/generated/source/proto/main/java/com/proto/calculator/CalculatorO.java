// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculatorO.proto

package com.proto.calculator;

public final class CalculatorO {
  private CalculatorO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_FindMaximumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_FindMaximumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_FindMaximumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_FindMaximumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021calculatorO.proto\022\ncalculator\"9\n\nSumRe" +
      "quest\022\024\n\014first_number\030\001 \001(\005\022\025\n\rsecond_nu" +
      "mber\030\002 \001(\005\"!\n\013SumResponse\022\022\n\nsum_result\030" +
      "\001 \001(\005\"1\n\037PrimeNumberDecompositionRequest" +
      "\022\016\n\006number\030\001 \001(\003\"8\n PrimeNumberDecomposi" +
      "tionResponse\022\024\n\014prime_factor\030\001 \001(\003\"\'\n\025Co" +
      "mputeAverageRequest\022\016\n\006number\030\001 \001(\005\")\n\026C" +
      "omputeAverageResponse\022\017\n\007average\030\001 \001(\001\"$" +
      "\n\022FindMaximumRequest\022\016\n\006number\030\001 \001(\005\"&\n\023" +
      "FindMaximumResponse\022\017\n\007maximum\030\001 \001(\005\"#\n\021" +
      "SquareRootRequest\022\016\n\006number\030\001 \001(\005\")\n\022Squ" +
      "areRootResponse\022\023\n\013number_root\030\001 \001(\0012\312\003\n" +
      "\021CalculatorService\0228\n\003Sum\022\026.calculator.S" +
      "umRequest\032\027.calculator.SumResponse\"\000\022y\n\030" +
      "PrimeNumberDecomposition\022+.calculator.Pr" +
      "imeNumberDecompositionRequest\032,.calculat" +
      "or.PrimeNumberDecompositionResponse\"\0000\001\022" +
      "[\n\016ComputeAverage\022!.calculator.ComputeAv" +
      "erageRequest\032\".calculator.ComputeAverage" +
      "Response\"\000(\001\022T\n\013FindMaximum\022\036.calculator" +
      ".FindMaximumRequest\032\037.calculator.FindMax" +
      "imumResponse\"\000(\0010\001\022M\n\nSquareRoot\022\035.calcu" +
      "lator.SquareRootRequest\032\036.calculator.Squ" +
      "areRootResponse\"\000B\030\n\024com.proto.calculato" +
      "rP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", });
    internal_static_calculator_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumResponse_descriptor,
        new java.lang.String[] { "SumResult", });
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
    internal_static_calculator_ComputeAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_calculator_ComputeAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_ComputeAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_calculator_ComputeAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_calculator_FindMaximumRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_calculator_FindMaximumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_FindMaximumRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_FindMaximumResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_calculator_FindMaximumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_FindMaximumResponse_descriptor,
        new java.lang.String[] { "Maximum", });
    internal_static_calculator_SquareRootRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_calculator_SquareRootRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_SquareRootResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_calculator_SquareRootResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootResponse_descriptor,
        new java.lang.String[] { "NumberRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
