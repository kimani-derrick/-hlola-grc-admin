package w2;

import Z2.H;
/* renamed from: w2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1397s implements InterfaceC1402x {

    /* renamed from: r  reason: collision with root package name */
    public static final C1397s f15858r = new C1397s(0);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15859q;

    public /* synthetic */ C1397s(int i7) {
        this.f15859q = i7;
    }

    @Override // w2.InterfaceC1402x
    public int a(Object obj) {
        C1392n c1392n = (C1392n) obj;
        switch (this.f15859q) {
            case 1:
                String str = c1392n.f15781a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (H.f4603a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return c1392n.f15781a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
