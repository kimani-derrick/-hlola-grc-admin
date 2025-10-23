package R2;

import M2.g;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f2889r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2890m;
    public final b n;

    /* renamed from: o  reason: collision with root package name */
    public LinkedHashMap f2891o;

    /* renamed from: p  reason: collision with root package name */
    public float f2892p = -3.4028235E38f;

    /* renamed from: q  reason: collision with root package name */
    public float f2893q = -3.4028235E38f;

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f2890m = true;
            String o7 = H.o((byte[]) list.get(0));
            AbstractC0156a.f(o7.startsWith("Format:"));
            b b7 = b.b(o7);
            b7.getClass();
            this.n = b7;
            j(new y((byte[]) list.get(1)), N3.e.f2497c);
            return;
        }
        this.f2890m = false;
        this.n = null;
    }

    public static int i(long j7, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j7) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j7) {
                    i7 = size + 1;
                    break;
                }
                size--;
            } else {
                i7 = 0;
                break;
            }
        }
        arrayList.add(i7, Long.valueOf(j7));
        if (i7 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i7 - 1));
        }
        arrayList2.add(i7, arrayList3);
        return i7;
    }

    public static long k(String str) {
        Matcher matcher = f2889r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i7 = H.f4603a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    @Override // M2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M2.h f(int r39, boolean r40, byte[] r41) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.f(int, boolean, byte[]):M2.h");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(Z2.y r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.j(Z2.y, java.nio.charset.Charset):void");
    }
}
