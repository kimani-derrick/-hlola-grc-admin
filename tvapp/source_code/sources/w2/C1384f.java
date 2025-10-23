package w2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* renamed from: w2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384f extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f15760b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f15761c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f15764h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f15765i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f15766j;

    /* renamed from: k  reason: collision with root package name */
    public long f15767k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15768l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f15769m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f15759a = new Object();
    public final s2.e d = new s2.e();

    /* renamed from: e  reason: collision with root package name */
    public final s2.e f15762e = new s2.e();
    public final ArrayDeque f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f15763g = new ArrayDeque();

    public C1384f(HandlerThread handlerThread) {
        this.f15760b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f15763g;
        if (!arrayDeque.isEmpty()) {
            this.f15765i = (MediaFormat) arrayDeque.getLast();
        }
        s2.e eVar = this.d;
        eVar.f13590a = 0;
        eVar.f13591b = -1;
        eVar.f13592c = 0;
        s2.e eVar2 = this.f15762e;
        eVar2.f13590a = 0;
        eVar2.f13591b = -1;
        eVar2.f13592c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f15759a) {
            this.f15769m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f15759a) {
            this.f15766j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f15759a) {
            this.d.d(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f15759a) {
            try {
                MediaFormat mediaFormat = this.f15765i;
                if (mediaFormat != null) {
                    this.f15762e.d(-2);
                    this.f15763g.add(mediaFormat);
                    this.f15765i = null;
                }
                this.f15762e.d(i7);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f15759a) {
            this.f15762e.d(-2);
            this.f15763g.add(mediaFormat);
            this.f15765i = null;
        }
    }
}
