package br.edu.ifg.calculator;

import br.edu.ifg.proto.calculator.CalculatorServiceGrpc;
import br.edu.ifg.proto.calculator.SumRequest;
import br.edu.ifg.proto.calculator.SumResponse;
import com.proto.calculator.PrimeNumberDecompositionRequest;
import com.proto.calculator.PrimeNumberDecompositionResponse;
import com.proto.calculator.SquareRootRequest;
import com.proto.calculator.SquareRootResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class CalculatorClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");
        CalculatorClient main = new CalculatorClient();
        main.run();
    }

    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",
                        50052)
                .usePlaintext()
                .build();
        doUnaryCall(channel);
        callingRequestCalculator(channel);
        System.out.println("Shutting down channel");
        channel.shutdown();
    }

    private void doUnaryCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub =
                CalculatorServiceGrpc.newBlockingStub(channel);
        SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(10)
                .setSecondNumber(25)
                .build();
        SumResponse response = stub.sum(request);
        System.out.println(request.getFirstNumber() + " + " +
                request.getSecondNumber() + " = " + response.getSumResult());
    }

    private void callingRequestCalculator(ManagedChannel channelCalculator) {
        com.proto.calculator.CalculatorServiceGrpc.CalculatorServiceBlockingStub
                calculatorDeviceOne = com.proto.calculator.CalculatorServiceGrpc.newBlockingStub(channelCalculator);
        PrimeNumberDecompositionRequest squareRootRequest = PrimeNumberDecompositionRequest.newBuilder().setNumber(2).build();
        Iterator<PrimeNumberDecompositionResponse> squareRootResponse = calculatorDeviceOne.primeNumberDecomposition(squareRootRequest);
        System.out.println(squareRootRequest.getNumber() + "- root number result = " + squareRootResponse.next().getPrimeFactor());
    }

}