package T2;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f3292a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3293b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3294c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3295e;
    public final g f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f3296g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3297h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3298i;

    /* renamed from: j  reason: collision with root package name */
    public final e f3299j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f3300k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f3301l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f3302m;

    public e(String str, String str2, long j7, long j8, g gVar, String[] strArr, String str3, String str4, e eVar) {
        boolean z7;
        this.f3292a = str;
        this.f3293b = str2;
        this.f3298i = str4;
        this.f = gVar;
        this.f3296g = strArr;
        if (str2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f3294c = z7;
        this.d = j7;
        this.f3295e = j8;
        str3.getClass();
        this.f3297h = str3;
        this.f3299j = eVar;
        this.f3300k = new HashMap();
        this.f3301l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            M2.a aVar = new M2.a();
            aVar.f2205a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((M2.a) treeMap.get(str)).f2205a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i7) {
        ArrayList arrayList = this.f3302m;
        if (arrayList != null) {
            return (e) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f3302m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z7) {
        boolean z8;
        String str = this.f3292a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z7 || equals || (equals2 && this.f3298i != null)) {
            long j7 = this.d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.f3295e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f3302m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f3302m.size(); i7++) {
            e eVar = (e) this.f3302m.get(i7);
            if (!z7 && !equals) {
                z8 = false;
            } else {
                z8 = true;
            }
            eVar.d(treeSet, z8);
        }
    }

    public final boolean f(long j7) {
        long j8 = this.d;
        int i7 = (j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1));
        long j9 = this.f3295e;
        if ((i7 == 0 && j9 == -9223372036854775807L) || ((j8 <= j7 && j9 == -9223372036854775807L) || ((j8 == -9223372036854775807L && j7 < j9) || (j8 <= j7 && j7 < j9)))) {
            return true;
        }
        return false;
    }

    public final void g(long j7, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f3297h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j7) && "div".equals(this.f3292a) && (str2 = this.f3298i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j7, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0266 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j7, boolean z7, String str, TreeMap treeMap) {
        String str2;
        boolean z8;
        HashMap hashMap = this.f3300k;
        hashMap.clear();
        HashMap hashMap2 = this.f3301l;
        hashMap2.clear();
        String str3 = this.f3292a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f3297h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f3294c && z7) {
            SpannableStringBuilder e3 = e(str2, treeMap);
            String str5 = this.f3293b;
            str5.getClass();
            e3.append((CharSequence) str5);
        } else if ("br".equals(str3) && z7) {
            e(str2, treeMap).append('\n');
        } else if (f(j7)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                CharSequence charSequence = ((M2.a) entry.getValue()).f2205a;
                charSequence.getClass();
                hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i7 = 0; i7 < c(); i7++) {
                e b7 = b(i7);
                if (!z7 && !equals) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                b7.i(j7, z8, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e7 = e(str2, treeMap);
                int length = e7.length() - 1;
                while (length >= 0 && e7.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e7.charAt(length) != '\n') {
                    e7.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                CharSequence charSequence2 = ((M2.a) entry2.getValue()).f2205a;
                charSequence2.getClass();
                hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
