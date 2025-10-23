package v6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* renamed from: v6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1343h extends F, ReadableByteChannel {
    String D();

    void F(long j7);

    int H();

    long J(C1344i c1344i);

    boolean M();

    long Q();

    long R(InterfaceC1342g interfaceC1342g);

    String S(Charset charset);

    InputStream T();

    boolean U(C1344i c1344i);

    C1341f c();

    C1344i l(long j7);

    long m();

    String o(long j7);

    void p(long j7);

    byte readByte();

    int readInt();

    short readShort();

    boolean t(long j7);

    long u(C1344i c1344i);

    int z(u uVar);
}
