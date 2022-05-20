function amount()
{
    let diemLy = parseInt(prompt('Mời nhập điểm Lý'));
    let diemHoa = parseInt(prompt('Mời nhập điểm Hóa'));
    let diemSinh = parseInt(prompt('Mời nhập điểm Sinh'));
    let tong = diemLy + diemHoa + diemSinh
    alert('Điểm tổng : ' + tong);
}
function avarage()
{
    let diemLy = parseInt(prompt('Mời nhập điểm Lý'));
    let diemHoa = parseInt(prompt('Mời nhập điểm Hóa'));
    let diemSinh = parseInt(prompt('Mời nhập điểm Sinh'));
    let trungbinh = (diemLy + diemHoa + diemSinh)/3;
    alert('Điểm trung bình : ' + trungbinh);
}
function trans()
{
    let C = parseInt(prompt('Mời nhập độ C'));
    let F = (9*C)/5+32;
    alert('Độ F : ' + F);
}
function perimeter()
{
    const pi = 3.14;
    let r = parseInt(prompt('Mời nhập bán kính'));
    let C = 2*r*pi;
    alert('Chu vi hình tròn : ' + C);
}
function acreage()
{
    const pi = 3.14;
    let r = parseInt(prompt('Mời nhập bán kính'));
    let S = r*r*pi;
    alert('Diện tích hình tròn : ' + S);
}