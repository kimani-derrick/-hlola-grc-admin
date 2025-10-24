package u0;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import r0.AbstractC1111a;
import s3.C1209y;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1209y f14650a = new C1209y(28);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14651b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f14652c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f14653e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f14654g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f14655h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f14656i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f14657j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) {
        int i7 = 0;
        for (a aVar : aVarArr) {
            i7 += ((((aVar.f14647g * 2) + 7) & (-8)) / 8) + (aVar.f14646e * 2) + d(aVar.f14643a, aVar.f14644b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i7);
        if (Arrays.equals(bArr, f)) {
            for (a aVar2 : aVarArr) {
                q(byteArrayOutputStream, aVar2, d(aVar2.f14643a, aVar2.f14644b, bArr));
                s(byteArrayOutputStream, aVar2);
                int[] iArr = aVar2.f14648h;
                int length = iArr.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    int i10 = iArr[i8];
                    v(byteArrayOutputStream, i10 - i9);
                    i8++;
                    i9 = i10;
                }
                r(byteArrayOutputStream, aVar2);
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f14643a, aVar3.f14644b, bArr));
            }
            for (a aVar4 : aVarArr) {
                s(byteArrayOutputStream, aVar4);
                int[] iArr2 = aVar4.f14648h;
                int length2 = iArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length2) {
                    int i13 = iArr2[i11];
                    v(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                r(byteArrayOutputStream, aVar4);
            }
        }
        if (byteArrayOutputStream.size() == i7) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i7);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z7 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            return z7;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f14655h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f14654g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return AbstractC1111a.t(sb, str3, str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static int e(int i7, int i8, int i9) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 4) {
                    return i8 + i9;
                }
                throw new IllegalStateException(AbstractC0515y1.l("Unexpected flag: ", i7));
            }
            return i8;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static void f(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] g(InputStream inputStream, int i7) {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = inputStream.read(bArr, i8, i7 - i8);
            if (read >= 0) {
                i8 += read;
            } else {
                throw new IllegalStateException(AbstractC0515y1.l("Not enough bytes to read: ", i7));
            }
        }
        return bArr;
    }

    public static int[] h(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += (int) n(byteArrayInputStream, 2);
            iArr[i9] = i8;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] i(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.c.i(java.io.FileInputStream, int, int):byte[]");
    }

    public static a[] j(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) {
        byte[] bArr3 = f14656i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int n = (int) n(fileInputStream, 1);
                    byte[] i7 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i7);
                        try {
                            a[] k5 = k(byteArrayInputStream, n, aVarArr);
                            byteArrayInputStream.close();
                            return k5;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f14657j)) {
            int n7 = (int) n(fileInputStream, 2);
            byte[] i8 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(i8);
                try {
                    a[] l7 = l(byteArrayInputStream2, bArr2, n7, aVarArr);
                    byteArrayInputStream2.close();
                    return l7;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, int i7, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 == aVarArr.length) {
            String[] strArr = new String[i7];
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = (int) n(byteArrayInputStream, 2);
                strArr[i8] = new String(g(byteArrayInputStream, (int) n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                a aVar = aVarArr[i9];
                if (aVar.f14644b.equals(strArr[i9])) {
                    int i10 = iArr[i9];
                    aVar.f14646e = i10;
                    aVar.f14648h = h(byteArrayInputStream, i10);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] l(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, a[] aVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i7 == aVarArr.length) {
            for (int i8 = 0; i8 < i7; i8++) {
                n(byteArrayInputStream, 2);
                String str2 = new String(g(byteArrayInputStream, (int) n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long n = n(byteArrayInputStream, 4);
                int n7 = (int) n(byteArrayInputStream, 2);
                a aVar = null;
                if (aVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= aVarArr.length) {
                            break;
                        } else if (aVarArr[i9].f14644b.equals(str)) {
                            aVar = aVarArr[i9];
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (aVar != null) {
                    aVar.d = n;
                    int[] h7 = h(byteArrayInputStream, n7);
                    if (Arrays.equals(bArr, f14655h)) {
                        aVar.f14646e = n7;
                        aVar.f14648h = h7;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] m(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f14653e)) {
            int n = (int) n(fileInputStream, 1);
            byte[] i7 = i(fileInputStream, (int) n(fileInputStream, 4), (int) n(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i7);
                try {
                    a[] o7 = o(byteArrayInputStream, str, n);
                    byteArrayInputStream.close();
                    return o7;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long n(InputStream inputStream, int i7) {
        byte[] g7 = g(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (g7[i8] & 255) << (i8 * 8);
        }
        return j7;
    }

    public static a[] o(ByteArrayInputStream byteArrayInputStream, String str, int i7) {
        TreeMap treeMap;
        int i8;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            int n = (int) n(byteArrayInputStream, 2);
            aVarArr[i9] = new a(str, new String(g(byteArrayInputStream, (int) n(byteArrayInputStream, 2)), StandardCharsets.UTF_8), n(byteArrayInputStream, 4), n, (int) n(byteArrayInputStream, 4), (int) n(byteArrayInputStream, 4), new int[n], new TreeMap());
        }
        for (int i10 = 0; i10 < i7; i10++) {
            a aVar = aVarArr[i10];
            int available = byteArrayInputStream.available() - aVar.f;
            int i11 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = aVar.f14649i;
                if (available2 <= available) {
                    break;
                }
                i11 += (int) n(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                for (int n7 = (int) n(byteArrayInputStream, 2); n7 > 0; n7--) {
                    n(byteArrayInputStream, 2);
                    int n8 = (int) n(byteArrayInputStream, 1);
                    if (n8 != 6 && n8 != 7) {
                        while (n8 > 0) {
                            n(byteArrayInputStream, 1);
                            for (int n9 = (int) n(byteArrayInputStream, 1); n9 > 0; n9--) {
                                n(byteArrayInputStream, 2);
                            }
                            n8--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                aVar.f14648h = h(byteArrayInputStream, aVar.f14646e);
                int i12 = aVar.f14647g;
                BitSet valueOf = BitSet.valueOf(g(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
                for (int i13 = 0; i13 < i12; i13++) {
                    if (valueOf.get(e(2, i13, i12))) {
                        i8 = 2;
                    } else {
                        i8 = 0;
                    }
                    if (valueOf.get(e(4, i13, i12))) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i13), Integer.valueOf(i8 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean p(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i7 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, aVarArr.length);
                int i8 = 2;
                int i9 = 2;
                for (a aVar : aVarArr) {
                    u(byteArrayOutputStream2, aVar.f14645c, 4);
                    u(byteArrayOutputStream2, aVar.d, 4);
                    u(byteArrayOutputStream2, aVar.f14647g, 4);
                    String d7 = d(aVar.f14643a, aVar.f14644b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d7.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i9 = i9 + 14 + length2;
                    byteArrayOutputStream2.write(d7.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i9 == byteArray.length) {
                    l lVar = new l(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(lVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < aVarArr.length) {
                        try {
                            a aVar2 = aVarArr[i10];
                            v(byteArrayOutputStream3, i10);
                            v(byteArrayOutputStream3, aVar2.f14646e);
                            i11 = i11 + 4 + (aVar2.f14646e * 2);
                            int[] iArr = aVar2.f14648h;
                            int length3 = iArr.length;
                            int i12 = i7;
                            while (i7 < length3) {
                                int i13 = iArr[i7];
                                v(byteArrayOutputStream3, i13 - i12);
                                i7++;
                                i12 = i13;
                            }
                            i10++;
                            i7 = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i11 == byteArray2.length) {
                        l lVar2 = new l(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(lVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < aVarArr.length) {
                            try {
                                a aVar3 = aVarArr[i14];
                                int i16 = 0;
                                for (Map.Entry entry : aVar3.f14649i.entrySet()) {
                                    i16 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream4, aVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                s(byteArrayOutputStream5, aVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                v(byteArrayOutputStream3, i14);
                                int length4 = byteArray3.length + i8 + byteArray4.length;
                                int i17 = i15 + 6;
                                ArrayList arrayList4 = arrayList3;
                                u(byteArrayOutputStream3, length4, 4);
                                v(byteArrayOutputStream3, i16);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i15 = i17 + length4;
                                i14++;
                                arrayList3 = arrayList4;
                                i8 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i15 == byteArray5.length) {
                            l lVar3 = new l(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(lVar3);
                            long j7 = 4;
                            long size = j7 + j7 + 4 + (arrayList2.size() * 16);
                            int i18 = 4;
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                l lVar4 = (l) arrayList2.get(i19);
                                u(byteArrayOutputStream, AbstractC0515y1.f(lVar4.f14667a), i18);
                                u(byteArrayOutputStream, size, i18);
                                boolean z7 = lVar4.f14669c;
                                byte[] bArr3 = lVar4.f14668b;
                                if (z7) {
                                    byte[] a7 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a7);
                                    u(byteArrayOutputStream, a7.length, 4);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    length = a7.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                                i18 = 4;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = f14653e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b7 = b(aVarArr, bArr4);
            u(byteArrayOutputStream, aVarArr.length, 1);
            u(byteArrayOutputStream, b7.length, 4);
            byte[] a8 = a(b7);
            u(byteArrayOutputStream, a8.length, 4);
            byteArrayOutputStream.write(a8);
            return true;
        }
        byte[] bArr5 = f14654g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, aVarArr.length, 1);
            for (a aVar4 : aVarArr) {
                String d8 = d(aVar4.f14643a, aVar4.f14644b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d8.getBytes(charset2).length);
                v(byteArrayOutputStream, aVar4.f14648h.length);
                u(byteArrayOutputStream, aVar4.f14649i.size() * 4, 4);
                u(byteArrayOutputStream, aVar4.f14645c, 4);
                byteArrayOutputStream.write(d8.getBytes(charset2));
                for (Integer num : aVar4.f14649i.keySet()) {
                    v(byteArrayOutputStream, num.intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i21 : aVar4.f14648h) {
                    v(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b8 = b(aVarArr, bArr6);
            u(byteArrayOutputStream, aVarArr.length, 1);
            u(byteArrayOutputStream, b8.length, 4);
            byte[] a9 = a(b8);
            u(byteArrayOutputStream, a9.length, 4);
            byteArrayOutputStream.write(a9);
            return true;
        }
        byte[] bArr7 = f14655h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar5 : aVarArr) {
                String d9 = d(aVar5.f14643a, aVar5.f14644b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d9.getBytes(charset3).length);
                TreeMap treeMap = aVar5.f14649i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar5.f14648h.length);
                u(byteArrayOutputStream, aVar5.f14645c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    v(byteArrayOutputStream, num2.intValue());
                }
                for (int i22 : aVar5.f14648h) {
                    v(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f14646e);
        u(byteArrayOutputStream, aVar.f, 4);
        u(byteArrayOutputStream, aVar.f14645c, 4);
        u(byteArrayOutputStream, aVar.f14647g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        byte[] bArr = new byte[(((aVar.f14647g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f14649i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i7 = intValue2 & 2;
            int i8 = aVar.f14647g;
            if (i7 != 0) {
                int e3 = e(2, intValue, i8);
                int i9 = e3 / 8;
                bArr[i9] = (byte) ((1 << (e3 % 8)) | bArr[i9]);
            }
            if ((intValue2 & 4) != 0) {
                int e7 = e(4, intValue, i8);
                int i10 = e7 / 8;
                bArr[i10] = (byte) ((1 << (e7 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i7 = 0;
        for (Map.Entry entry : aVar.f14649i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i7);
                v(byteArrayOutputStream, 0);
                i7 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ca, code lost:
        if (r5 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r7.canWrite() == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Type inference failed for: r6v23, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r19, java.util.concurrent.Executor r20, u0.b r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.c.t(android.content.Context, java.util.concurrent.Executor, u0.b, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j7, int i7) {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        u(byteArrayOutputStream, i7, 2);
    }
}
