package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public class B extends IOException {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.A, java.io.IOException] */
    public static A b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B e() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.io.IOException] */
    public static B f() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
