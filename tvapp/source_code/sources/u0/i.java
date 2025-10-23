package u0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f14661a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14662b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14663c;
    public final long d;

    public i(int i7, int i8, long j7, long j8) {
        this.f14661a = i7;
        this.f14662b = i8;
        this.f14663c = j7;
        this.d = j8;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f14661a);
            dataOutputStream.writeInt(this.f14662b);
            dataOutputStream.writeLong(this.f14663c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f14662b == iVar.f14662b && this.f14663c == iVar.f14663c && this.f14661a == iVar.f14661a && this.d == iVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14662b), Long.valueOf(this.f14663c), Integer.valueOf(this.f14661a), Long.valueOf(this.d));
    }
}
