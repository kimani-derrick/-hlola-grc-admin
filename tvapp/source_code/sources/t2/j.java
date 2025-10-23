package t2;

import Z2.y;
import k2.InterfaceC0948m;
import k2.w;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b  reason: collision with root package name */
    public w f14559b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0948m f14560c;
    public InterfaceC1236g d;

    /* renamed from: e  reason: collision with root package name */
    public long f14561e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f14562g;

    /* renamed from: h  reason: collision with root package name */
    public int f14563h;

    /* renamed from: i  reason: collision with root package name */
    public int f14564i;

    /* renamed from: k  reason: collision with root package name */
    public long f14566k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14567l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14568m;

    /* renamed from: a  reason: collision with root package name */
    public final C1234e f14558a = new C1234e();

    /* renamed from: j  reason: collision with root package name */
    public i f14565j = new i((char) 0, 0);

    public void a(long j7) {
        this.f14562g = j7;
    }

    public abstract long b(y yVar);

    public abstract boolean c(y yVar, long j7, i iVar);

    public void d(boolean z7) {
        int i7;
        if (z7) {
            this.f14565j = new i((char) 0, 0);
            this.f = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f14563h = i7;
        this.f14561e = -1L;
        this.f14562g = 0L;
    }
}
