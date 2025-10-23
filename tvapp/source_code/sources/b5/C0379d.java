package b5;

import H2.C0002c;
import V.InterfaceC0090i;
import Z4.C0165b;
import java.util.regex.Pattern;
import z5.C1527i;
/* renamed from: b5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379d implements o {

    /* renamed from: q  reason: collision with root package name */
    public final N4.e f7138q;

    /* renamed from: r  reason: collision with root package name */
    public final C0165b f7139r;

    /* renamed from: s  reason: collision with root package name */
    public final C0002c f7140s;

    /* renamed from: t  reason: collision with root package name */
    public final C1527i f7141t;

    /* renamed from: u  reason: collision with root package name */
    public final e6.d f7142u = e6.e.a();

    public C0379d(D5.i iVar, N4.e eVar, C0165b c0165b, C0002c c0002c, InterfaceC0090i interfaceC0090i) {
        this.f7138q = eVar;
        this.f7139r = c0165b;
        this.f7140s = c0002c;
        this.f7141t = new C1527i(new D0.h(6, interfaceC0090i));
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        M5.g.e(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        M5.g.e(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final n a() {
        return (n) this.f7141t.getValue();
    }

    @Override // b5.o
    public final V5.a d() {
        C0381f c0381f = a().f7175b;
        if (c0381f != null) {
            Integer num = c0381f.f7150c;
            if (num == null) {
                return null;
            }
            int i7 = V5.a.f3731t;
            return new V5.a(android.support.v4.media.session.b.C0(num.intValue(), V5.c.SECONDS));
        }
        M5.g.l("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:43:0x00ab, B:45:0x00b7, B:48:0x00c2, B:35:0x0085, B:37:0x008f, B:40:0x009a), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:43:0x00ab, B:45:0x00b7, B:48:0x00c2, B:35:0x0085, B:37:0x008f, B:40:0x009a), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:43:0x00ab, B:45:0x00b7, B:48:0x00c2, B:35:0x0085, B:37:0x008f, B:40:0x009a), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:43:0x00ab, B:45:0x00b7, B:48:0x00c2, B:35:0x0085, B:37:0x008f, B:40:0x009a), top: B:59:0x002c }] */
    /* JADX WARN: Type inference failed for: r5v3, types: [L5.p, F5.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    @Override // b5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(D5.d r24) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0379d.f(D5.d):java.lang.Object");
    }

    @Override // b5.o
    public final Boolean i() {
        C0381f c0381f = a().f7175b;
        if (c0381f != null) {
            return c0381f.f7148a;
        }
        M5.g.l("sessionConfigs");
        throw null;
    }

    @Override // b5.o
    public final Double j() {
        C0381f c0381f = a().f7175b;
        if (c0381f != null) {
            return c0381f.f7149b;
        }
        M5.g.l("sessionConfigs");
        throw null;
    }
}
