package w2;

import a3.C0208h;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* renamed from: w2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1389k {
    void a();

    int d(MediaCodec.BufferInfo bufferInfo);

    void f(long j7, int i7);

    void flush();

    ByteBuffer g(int i7);

    void h(Surface surface);

    void i(Bundle bundle);

    void j(int i7, boolean z7);

    ByteBuffer k(int i7);

    void l(C0208h c0208h, Handler handler);

    int m();

    void n(int i7);

    MediaFormat o();

    void p(int i7, int i8, long j7, int i9);

    void q(int i7, i2.c cVar, long j7);
}
