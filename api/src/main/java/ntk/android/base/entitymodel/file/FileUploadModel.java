package ntk.android.base.entitymodel.file;

import com.google.gson.annotations.SerializedName;

public class FileUploadModel {
    @SerializedName("FileName")
    public String FileName;
    @SerializedName("FileKey")
    public String FileKey;
    @SerializedName("ChunkNumber")
    public int ChunkNumber;
    @SerializedName("ChunkSize")
    public long ChunkSize;
    @SerializedName("CurrentChunkSize")
    public long CurrentChunkSize;
    @SerializedName("TotalSize")
    public long TotalSize;
    @SerializedName("Identifier")
    public String Identifier;
    @SerializedName("RelativePath")
    public String RelativePath;
    @SerializedName("TotalChunks")
    public int TotalChunks;
}
