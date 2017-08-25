

JAVA_OUT = BabelfishClient/src/main/java/
PROTO_CMD := protoc --java_out=$(JAVA_OUT)
.PHONY : proto

GPRC = /home/manu/.m2/repository/io/grpc/protoc-gen-grpc-java/1.5.0/protoc-gen-grpc-java-1.5.0-linux-x86_64.exe

proto:
	$(PROTO_CMD) github.com/bblfsh/sdk/protocol/generated.proto
	$(PROTO_CMD) github.com/bblfsh/sdk/uast/generated.proto
	$(PROTO_CMD) google/protobuf/compiler/plugin.proto
	$(PROTO_CMD) google/protobuf/any.proto
	$(PROTO_CMD) google/protobuf/api.proto
	$(PROTO_CMD) google/protobuf/descriptor.proto
	$(PROTO_CMD) google/protobuf/duration.proto
	$(PROTO_CMD) google/protobuf/empty.proto
	$(PROTO_CMD) google/protobuf/field_mask.proto
	$(PROTO_CMD) google/protobuf/source_context.proto
	$(PROTO_CMD) google/protobuf/struct.proto
	$(PROTO_CMD) google/protobuf/timestamp.proto
	$(PROTO_CMD) google/protobuf/type.proto
	$(PROTO_CMD) google/protobuf/wrappers.proto

	protoc --plugin=protoc-gen-grpc-java=$(GPRC) \
  --grpc-java_out=BabelfishClient/src/main/java/ github.com/bblfsh/sdk/protocol/generated.proto