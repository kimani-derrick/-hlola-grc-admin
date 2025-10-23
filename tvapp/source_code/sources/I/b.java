package I;

import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class b {
    public static final String d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f1191e;
    public static final b f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f1192g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1193a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1194b;

    /* renamed from: c  reason: collision with root package name */
    public final h f1195c;

    static {
        h hVar = i.f1204c;
        d = Character.toString((char) 8206);
        f1191e = Character.toString((char) 8207);
        f = new b(false, 2, hVar);
        f1192g = new b(true, 2, hVar);
    }

    public b(boolean z7, int i7, h hVar) {
        this.f1193a = z7;
        this.f1194b = i7;
        this.f1195c = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.f1190c <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            I.a r0 = new I.a
            r0.<init>(r9)
            r9 = 0
            r0.f1190c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f1190c
            int r5 = r0.f1189b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.f1188a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f1190c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f1190c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f1190c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f1190c
            int r4 = r4 + r6
            r0.f1190c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = I.a.f1187e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = r6
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = r7
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.f1190c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r7) {
        /*
            I.a r0 = new I.a
            r0.<init>(r7)
            int r7 = r0.f1189b
            r0.f1190c = r7
            r7 = 0
            r1 = r7
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f1190c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L3b
            r5 = 1
            if (r3 == r5) goto L35
            r6 = 2
            if (r3 == r6) goto L35
            r6 = 9
            if (r3 == r6) goto Lc
            switch(r3) {
                case 14: goto L31;
                case 15: goto L31;
                case 16: goto L2a;
                case 17: goto L2a;
                case 18: goto L27;
                default: goto L24;
            }
        L24:
            if (r2 != 0) goto Lc
            goto L40
        L27:
            int r1 = r1 + 1
            goto Lc
        L2a:
            if (r2 != r1) goto L2e
        L2c:
            r7 = r5
            goto L41
        L2e:
            int r1 = r1 + (-1)
            goto Lc
        L31:
            if (r2 != r1) goto L2e
        L33:
            r7 = r4
            goto L41
        L35:
            if (r1 != 0) goto L38
            goto L2c
        L38:
            if (r2 != 0) goto Lc
            goto L40
        L3b:
            if (r1 != 0) goto L3e
            goto L33
        L3e:
            if (r2 != 0) goto Lc
        L40:
            goto Lb
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, h hVar) {
        h hVar2;
        char c5;
        h hVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean e3 = hVar.e(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.f1194b & 2;
        String str2 = "";
        String str3 = f1191e;
        String str4 = d;
        boolean z7 = this.f1193a;
        if (i7 != 0) {
            if (e3) {
                hVar3 = i.f1203b;
            } else {
                hVar3 = i.f1202a;
            }
            boolean e7 = hVar3.e(charSequence.length(), charSequence);
            if (!z7 && (e7 || a(charSequence) == 1)) {
                str = str4;
            } else if (!z7 || (e7 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str3;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (e3 != z7) {
            if (e3) {
                c5 = 8235;
            } else {
                c5 = 8234;
            }
            spannableStringBuilder.append(c5);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (e3) {
            hVar2 = i.f1203b;
        } else {
            hVar2 = i.f1202a;
        }
        boolean e8 = hVar2.e(charSequence.length(), charSequence);
        if (!z7 && (e8 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z7 && (!e8 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
